

pipeline {
    agent  any 
    stages {
        stage('build') {
            steps {
                sh 'echo hello world'
                script {
                    cool.greeting 'Good evening everybody'
                    cool.info 'Stay Cool !'
                }    
            }
        }
    }
}
