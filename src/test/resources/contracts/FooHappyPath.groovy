org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/foo?request=baz'
    }

    response {
        status 200
        body("""
          {
            "bar": "baz!!!",
          }
          """)

    }
}