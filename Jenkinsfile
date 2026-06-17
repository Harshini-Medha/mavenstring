pipeline
{
  agent any
  tools{
    maven 'Maven'
  }

  stages{
    stage('CheckOut'){
      steps{
        git branch: 'master',url:'https://github.com/Harshini-Medha/mavenstring.git'
      }
    }
   stage('Build'){
     steps{
       sh 'mvn clean package'
     }
   }
    stage('Test')
    {
      steps{
        sh 'mvn test'
      }
    }
    stage('Run Application')
    {
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    }
  }
  post{
    success{
      echo 'Build and Deployment Sucessful!'
    }
    failure{
      echo 'Build failed'
    }
  }
}

        
