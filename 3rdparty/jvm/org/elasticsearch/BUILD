v6='6.2.4'

jar_library(
    name = 'rest6',
    jars = [
        jar(
            org='org.elasticsearch.client',
            name='elasticsearch-rest-high-level-client',
            rev=v6,
            force = True
        ),
    ],
    managed_dependencies=':es-v6'
)

jar_library(
    name='sniffer6',
    jars=[
        jar(
            org='org.elasticsearch.client',
            name='elasticsearch-rest-client-sniffer',
            rev=v6,
            force = True
        ),
    ],
    managed_dependencies=':es-v6'
)



managed_jar_libraries(name='es-v6',
    artifacts=[
        jar('org.elasticsearch', 'elasticsearch', v6),
    ],
)
