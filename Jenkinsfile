pipeline {
    agent any
    parameters {
        choice(name: 'version', choices: ['1.0.0', '1.0.1', '1.2.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    
    stages {
        stage('Init') {
            steps {
                script {
                    myScript = load "script.groovy"
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    myScript.buildApp()
                }
                
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    myScript.testApp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    myScript.deployApp()
                }
            }
        }
            
    }
}
