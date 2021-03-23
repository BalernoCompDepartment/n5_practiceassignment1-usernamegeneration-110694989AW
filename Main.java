class Main {
  public static void main(String[] args) {
    String[] endings = {"ing", "end", "axe", "gex", "goh"};

    int students = Keyboard.getInt("how many students?");
    
    for(int index = 0; index < students; index++) {
      String name = Keyboard.getText("what are the first 3 letters of pupil " + (index + 1) + "'s name?");
      
      while(name.length() != 3){
        Screen.display("error, it must be 3 characters", "error");
        name = Keyboard.getText("what are the first 3 letters of pupil " + (index + 1) + "'s name?");
      }
      
      String ending = endings[N5.randomInt(4)];
      
      String username = name + ending;
      
      String output = "pupil " + (index + 1) + "'s username is " + username;
      
      Screen.display(output, "username output");
    }
  }
}






