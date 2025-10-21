pipeline {
    agent any
    
    tools {
        maven 'Maven-3.9.9'
        jdk 'jdk17'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/anubhavsdetdevops/java-selenium-devops.git'
            }
        }
        
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    
    post {
        always {
            publishHTML target: [
                reportDir: 'target/surefire-reports',
                reportFiles: 'index.html',
                reportName: 'Test Report'
            ]
        }
    }
}
