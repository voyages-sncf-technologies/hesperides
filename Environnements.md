## Doc sur le wiki
- https://wiki.vsct.fr/display/VSCTCOM/Refonte (onglets Mise en prod et Release)
- Product board : https://wiki.vsct.fr/display/KTN/Product+Board+HESPERIDES
 
## Plateformes
Exemple d'accès en SSH depuis un terminal, avec `$USER` votre login Windows, via bastion :

    $ ssh -A -l adminapptest@chiwawa+SSH+$USER wallix
    adminapptest@chiwawa $ ssh ciaobaby-bck

### DEV
- VM : `ciaobaby` ([puppetexplorer](http://puppetexplorer-horsprod.socrate.vsct.fr/#/node/ciaobaby.socrate.vsct.fr) - [puppet-configuration-horsprod/config/enc/PUPPEA/_DOCKER_ENGINE/DMZ_ASSEMBLAGE/ciaobaby.socrate.vsct.fr.yml](https://gitlab.socrate.vsct.fr/dtaas/puppet-configuration-horsprod/tree/master/config/enc/PUPPEA/_DOCKER_ENGINE/DMZ_ASSEMBLAGE))
- YAML : [yaml_hors_prod/HES-REL1.yaml](https://gitlab.socrate.vsct.fr/toolboxyaml/yaml_hors_prod/blob/master/HES-REL1.yaml)
- liste des endpoints grâce à `spring-boot-starter-actuator`: <http://ciaobaby:52700/rest/mappings>
- [Swagger](http://ciaobaby:52700/rest/swagger-ui.html)
- [Centreon (central-horsprod)](https://central-horsprod.socrate.vsct.fr/centreon/main.php?p=20202&o=hd&host_name=ciaobaby)
 
### INT
- VM : `dare` ([puppetexplorer](http://puppetexplorer-horsprod.socrate.vsct.fr/#/node/dare.socrate.vsct.fr) - [puppet-configuration-horsprod/config/enc/PUPPET/INTEGRATION/HES/dare.socrate.vsct.fr.yml](https://gitlab.socrate.vsct.fr/dtaas/puppet-configuration-horsprod/blob/master/config/enc/PUPPET/INTEGRATION/HES/dare.socrate.vsct.fr.yml))
- YAML : [yaml_hors_prod/HES-INT1.yaml](https://gitlab.socrate.vsct.fr/toolboxyaml/yaml_hors_prod/blob/master/HES-INT1.yaml)
- liste des endpoints grâce à `spring-boot-starter-actuator`: <http://dare:52700/rest/mappings>
- [Swagger](http://dare:52700/rest/swagger-ui.html)
- [Centreon (central-horsprod)](https://central-horsprod.socrate.vsct.fr/centreon/main.php?p=20202&o=hd&host_name=dare)

### PROD
- VM : `bogogno` ([puppetexplorer](http://puppetexplorer-prod.socrate.vsct.fr/#/node/bogogno.socrate.vsct.fr) - [puppet-configuration-prod/config/enc/USINE_LOGICIELLE/HESPERIDES/bogogno.socrate.vsct.fr.yml](https://gitlab.socrate.vsct.fr/dtaas/puppet-configuration-prod/tree/master/config/enc/USINE_LOGICIELLE/HESPERIDES))
- YAML : [yaml_hors_prod/HES-PRD1.yaml](https://gitlab.socrate.vsct.fr/toolboxyaml/yaml_hors_prod/blob/master/HES-PRD1.yaml)
- liste des endpoints grâce à `spring-boot-starter-actuator`: <http://bogogno:52700/rest/mappings>
- [Swagger](http://bogono:52700/rest/swagger-ui.html)
- [Centreon (grado)](http://grado/centreon/main.php?p=201&o=hd&host_name=Bogogno) - **TODO** lien vers [Centreon (central-prod)]()

## HAPs
- hors prod (REL1 et INT1) : [haproxy-configuration-horsprod/HES/hapHESREL1.conf](https://gitlab.socrate.vsct.fr/dt/haproxy-configuration-horsprod/blob/master/HES/hapHESREL1.conf)
- prod : [haproxy-configuration-prod/USL/hapUSLPRD1-DMZTECH.conf](https://gitlab.socrate.vsct.fr/dt/haproxy-configuration-prod/blob/master/USL/hapUSLPRD1-DMZTECH.conf)

## Log files
Les logs sont archivés dans `/appl/syslogng/logs` sur les VMs.
Aucune rotation n'est pour le moment en place.

Fichiers de configuration:
- [syslog_ciaobaby.conf](https://gitlab.socrate.vsct.fr/dt/syslogng-configuration-horsprod/blob/master/syslog_ciaobaby.conf)
- [syslog_dare.conf](https://gitlab.socrate.vsct.fr/dt/syslogng-configuration-horsprod/blob/master/syslog_dare.conf)
