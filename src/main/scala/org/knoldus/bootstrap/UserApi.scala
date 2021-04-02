package org.knoldus.bootstrap
import org.knoldus.db.Db
import userAndUserValidation.User
import org.knoldus.impl.Impl
import userAndUserValidation.User_Valid
object UserApi {
  def main(args: Array[String]): Unit = {
    val userValidator: User_Valid = new User_Valid
    val userRequest: Db[User] = new Impl(userValidator)
    userRequest.create(User(1, "Divyansh", "divyansh@gmail.com", "admin"))
    userRequest.create(User(2, "Devrani", "devrani@gmail.com", "customer"))
    userRequest.update(2, "Devrani")
    userRequest.display()
    userRequest.delete(2)
    userRequest.retrieve(1)
  }
}
