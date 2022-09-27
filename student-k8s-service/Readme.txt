kubectl create deployment lum-stud2 --image=vatsank/lumen-student-service:1.0 --replicas=3

kubectl get deployments

kubectl expose deployment lum-stud1 --type=LoadBalancer --name=student-service2022 --port=8080

kubectl get services

