# Before run

* install minikube https://kubernetes.io/docs/tasks/tools/install-minikube/
* install skaffold https://skaffold.dev/docs/install/

# Run app

* start minikube `minikube start`
* set docker environment `eval $(minikube docker-env)`
* start application from application root with `skaffold dev`