pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/amanbh321/spe_mini_project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Check Ansible Version') {
            steps {
                sh '/usr/bin/ansible --version'  // Use the correct path from Step 1
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i localhost, -c local deploy.yml'
            }
        }
    }
}
