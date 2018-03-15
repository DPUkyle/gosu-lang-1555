uses wut.Wut
uses cucumber.api.gosu.en.Dsl

Dsl.Given("^Hello (.*)$", \ x -> {
  var w = new Wut()
  print("\nIt's working, " + x.toUpperCase())
})