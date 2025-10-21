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
                sh '''
                    # Download and use Maven wrapper
                    if [ ! -f "mvnw" ]; then
                        curl -s https://repo1.maven.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar -o maven-wrapper.jar
                        java -jar maven-wrapper.jar download
                    fi
                    ./mvnw clean test
                '''
            }
        }
    }
    
    post {
        always {
            archiveArtifacts 'target/surefire-reports/**/*'
        }
    }
}
