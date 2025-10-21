pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/anubhavsdetdevops/java-selenium-devops.git'
            }
        }
        
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
            post {
                always {
                    archiveArtifacts 'target/surefire-reports/**/*'
                    publishHTML target: [
                        reportDir: 'target/surefire-reports',
                        reportFiles: 'index.html',
                        reportName: 'TestNG Report'
                    ]
                }
            }
        }
    }
}
