# Hespérides Pipeline

![alt text](CICD-resource.png)

**Continous Delivery** ==> manual deployment

## Tips

Tester une image docker pushée dans le registry privé vsct :
````cmd
docker login --username admgit --password 'XXXXXXXXX' https://docker-vsct.pkg.cloud.socrate.vsct.fr 
docker pull docker-vsct.pkg.cloud.socrate.vsct.fr/hesperides/hesperides:develop 
````