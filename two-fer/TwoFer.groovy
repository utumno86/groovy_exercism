class TwoFer {
  static String twoFer(String name) {
    if (name?.trim() == '' || name == null){
      return "One for you, one for me."
    } else {
      return "One for ${name}, one for me."
    }
  }
}
