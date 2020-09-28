pipeline {
    agent  any 
    stages {
        stage('indu') {
            steps {
                sh 'echo hello world'
                script {
                    cool.greeting 'Good evening everybody'
                    cool.info 'Stay Cool !'
                }
            }
        }
        stage('sebastian'){
            steps{
                script{
                    calc.calculation
                }
            }
        }    
        stage('groovyray') {
            steps {
                script {
                    groovyray.message 'Funky'
                    groovyray.warning 'CRITICAL'
                }    
            }
        }
    }        
    
}