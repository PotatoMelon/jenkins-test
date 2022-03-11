pipeline {
    agent any
    paremeters {
        choice(name: 'version', choices: ['1.0.0', '1.0.1', '1.2.0'], description '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    
    stages {
        stage('Build') {
            steps {
                echo 'building...'
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                echo 'testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo "deploying version ${params.version}"
            }
        }
            
    }
}
