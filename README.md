Sample demo for Docker

https://labs.play-with-docker.com Use Docker Hub Id

git clone https://github.com/Akshat0210/dockerdemo

cd dockerdemo

docker build -t akshat0210/sampledemo:v1 .

https://labs.play-with-k8s.com/  - User Docker Hub Id

Create namepsace :
kubectl create -f ns.yml

Create deployment: 
kubectl create -f deployment.yml

Login to Pod:
kubectl exec -n javacop -it "Podname" -- /bin/bash

Create service :
kubectl create -f service.yml


Cheking logs for pod:
kubectl logs "podname"
