pipeline{
    agent any
    tools{
	maven "Maven_Home"
}
    stages{
        stage("Build"){
            steps{
                bat 'mvn -DskipTests clean package'
            }
        }
        stage("Test"){
            steps{
                bat 'mvn test'
            }
        }
    }
}
