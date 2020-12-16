package ru.job4j.tracker;


public class StartUI {

 public static void createItem(Input input, Tracker tracker) {
  System.out.println("=== Create a new Item ====");
  String name = input.askStr("Enter name: ");
  Item item = new Item(name);
  tracker.add(item);
 }

 public static void showItem(Input input, Tracker tracker) {
  Item[] item = tracker.findAll();
  System.out.println("=== Show all Items ====");
  for (int index = 0; index < item.length; index++) {
   System.out.println(item[index]);
  }
 }

 public static void editItem(Input input, Tracker tracker) {
  System.out.println("=== Edit item ====");
  int id = Integer.valueOf(input.askStr("Enter id:  "));
  String name = input.askStr("Enter name:  ");
  Item item = new Item();
  item.setName(name);
  if (tracker.replace(id, item)) {
   System.out.println("Replace had been succes");
  }
 }

 public static void deleteItem(Input input, Tracker tracker) {
  System.out.println("=== Delete item ====");
  int id = Integer.valueOf(input.askStr("Enter id:  "));
  if (tracker.delete(id)) {
   System.out.println("Delete had been succes");
  } else {
   System.out.println("Delete falled");
  }
 }

 public static void findByIdItem(Input input, Tracker tracker) {
  System.out.println("=== Find items by name ====");
  String name = input.askStr("Enter name:  ");
  Item[] item = tracker.findByName(name);
  if (item.length > 0) {
   for (int index = 0; index < item.length; index++) {
    System.out.println(item[index]);
   }
  }
 }

 public static void findByName(Input input, Tracker tracker) {
  System.out.println("=== Find items by name ====");
  String name = input.askStr("Enter name:  ");
  Item[] item = tracker.findByName(name);
  if (item.length > 0) {
   for (int index = 0; index < item.length; index++) {
    System.out.println(item[index]);
   }
  }else{
    System.out.println("Заявки с таким именем не найдены");
   }
  }


 public void init(Input input, Tracker tracker) {
  boolean run = true;
  while (run) {
   this.showMenu();
   int select = Integer.valueOf(input.askStr("Select: "));
   if (select == 0) {
    StartUI.createItem(input, tracker);

   } else if (select == 1) {
    StartUI.showItem(input, tracker);

   } else if (select == 2) {
    StartUI.editItem(input, tracker);

   }else if (select == 3) {
    StartUI.deleteItem(input, tracker);


   }else if (select == 4) {
    StartUI.findByIdItem(input, tracker);


   }else if (select == 5) {
    StartUI.findByName(input, tracker);

   } else if (select == 6) {
    run = false;
   }
  }
 }
 private void showMenu() {

  System.out.println("MENU:\n" +
          "0. Add new Item\n" +
          "1. Show all items\n" +
          "2. Edit item\n" +
          "3. Delete item\n" +
          "4. Find item by Id\n" +
          "5. Find items by name\n" +
          "6. Exit Program\n");

 }
 public static void main(String[] args) {
  Input input = new ConsoleInput();
  Tracker tracker = new Tracker();
  new StartUI().init(input, tracker);
 }
}



 


