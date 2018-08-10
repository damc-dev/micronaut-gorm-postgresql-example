mn --version | tee create-app.log
mn create-app --features=groovy,spock,jdbc-tomcat,hibernate-gorm micronaut-gorm-postgresql-example | tee create-app.log
