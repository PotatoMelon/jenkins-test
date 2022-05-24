@Library("shared-library") _
pipeline {
    agent any
    parameters {
        choice(name: 'version', choices: ['1.0.0', '1.0.1', '1.2.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    
    stages {
        stage('Init') {
            steps {

            }
        }
        stage('Build') {
            steps {

                
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
            }
        }
        stage('Deploy') {
            steps {

            }
        }
            
    }
}
