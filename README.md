> [!TIP]
> Dokumentationen: [Minikube](https://minikube.sigs.k8s.io/docs/), [Spring Config Watcher](https://docs.spring.io/spring-cloud-kubernetes/reference/spring-cloud-kubernetes-configuration-watcher.html)

> [!IMPORTANT]
> Aufgesetzter Minikube oder Kubernetes cluster wird benötigt</br>
> Helmcharts sind noch in Arbeit! :)

# Anleitung
Um die Testumgebung zum laufen zu bringen, müssen folgende Schritte erledigt werden.
1. Anwendung als Docker image bauen
2. Docker image in Kubernetes/Minikube hochladen
3. Die Kubernetes files hochladen 
4. Kubernetes files des Configwatchers hochladen

> [!NOTE]
> Hierfür muss der k8s und der k8s/configwatcher Ordner hochgeladen werden

Folgende Befehle können hilfreich sein
```
Bauen des Docker images:
Docker build -t test-restservice:v1.0.1 .

hochladen von Kubernetes Datein:
kubectl apply -f [Ordner]
```

# Übersicht
![configwatcher](/resources/Diagram_Configwatcher.png)
