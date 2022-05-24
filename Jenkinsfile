// @Library("shared-library") _
pipeline {
    agent any
    parameters {
        choice(name: 'version', choices: ['1.0.0', '1.0.1', '1.2.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    
    stages {
        stage('Init') {
            steps {
                echo "init stage"
            }
        }
//         stage('Build') {
//             steps {
//                 sh 'build stage'
//             }
//         }
//         stage('Test') {
// //             when {
// //                 expression {
// //                     params.executeTests
// //                 }
// //             }
//             steps {
//                 sh 'test stage'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 sh 'deploy stage'
//             }
//         }
            
    }
}
