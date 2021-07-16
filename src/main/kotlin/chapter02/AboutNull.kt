package chapter02

//val x: Int? = 3
//val y: Int = x // error

val x: Int = 3
val y: Int? = x

// val city: City? = map[companyName]?.manager?.address?.city
// val city: City? = map[companyName]!!.manager!!.address!!.city
// val city: City  = map[companyName]?.manager?.address?.city ?: City.UNKNOWN
/*  in JAVA
    City city = Optional.ofNullable(map.get(companyName))
                        .flatMap(Company::getManager)
                        .flatMap(Employee::getAddress)
                        .flatMap(Address:getCity)
                        .getOrElse(null);
 */