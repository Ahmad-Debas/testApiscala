object  testApi {

  def main(args:Array[String]) = {
    val res = requests.get("https://api.github.com/users/baeldung")
    val resaulttext = res.text();
   // println(resaulttext) // get Api

    val r = requests.get("https://postman-echo.com/basic-auth", auth = ("postman", "password"))//GET Request with Authentication
    //println(r)

    val pp = requests.post("http://httpbin.org/post", data = Map("key"->"value")) // post requsts
    println(pp);


  }

}
