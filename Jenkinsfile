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
                    # Use system Maven (already installed in Jenkins)
                    which mvn || echo "Maven not found, trying alternatives..."
                    
                    # If Maven not available, use direct Java execution
                    if ! command -v mvn &> /dev/null; then
                        echo "Using Java directly to compile and run tests..."
                        javac -cp "$(find . -name "*.jar" | tr '\n' ':')target/classes" src/test/java/com/example/SimpleTest.java
                        java -cp "$(find . -name "*.jar" | tr '\n' ':')target/test-classes" org.testng.TestNG testng.xml
                    else
                        mvn clean test
                    fi
                '''
            }
        }
    }
}
