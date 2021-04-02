package userAndUserValidation
class User_Valid{
  def userIsValid(user: User): Boolean = {
    if (user.name.matches("^[a-zA-Z\\\\s]+$")  && user.branch.matches("^\\S+@\\S+\\.(com|net|org|in)$") &&
      user.course.matches("(customer|admin)") && user.id.isValidInt) {
      true
    } else{
      false
    }
  }
}
