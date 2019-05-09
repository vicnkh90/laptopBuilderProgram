import java.util.Scanner;

public class LaptopBuilderProgram {
  // laptop choice
  static int executeLaptop(String laptop) {
    if (laptop.equals("Latitude")) {
      return 1500;
    }
    if (laptop.equals("Alienware")) {
      return 2500;
    }
    if (laptop.equals("Inspiron")) {
      return 400;
    }
    return 0;
  }

  // Screen e.g. 1080p, 4k, Touchscreen
  static int executeScreen(String screen) {
    if (screen.equals("1080p")) {
      return 200;
    }
    if (screen.equals("4k")) {
      return 500;
    }
    if (screen.equals("Touchscreen")) {
      return 2000;
    }
    return 0;
  }

  // RAM e.g. 8GB, 16 GB, 32GB
  static int executeMemory(String memory) {
    if (memory.equals("8GB")) {
      return 100;
    }
    if (memory.equals("16GB")) {
      return 200;
    }
    if (memory.equals("32GB")) {
      return 300;
    }
    return 0;
  }

  // HDD e.g. 1TB HDD, 128GB SSD, 256GB SSD, 512 GB SSD
  static int executeHDD(String hdd) {
    if (hdd.equals("128GB HDD")) {
      return 150;
    }
    if (hdd.equals("256GB HDD")) {
      return 250;
    }
    if (hdd.equals("512GB HDD")) {
      return 350;
    }
    if (hdd.equals("1TB HDD")) {
      return 550;
    }
    return 0;
  }

  // Processor e.g. i3, i5, i7
  static int executeProcessor(String processor) {
    if (processor.equals("Intel i3 Core Processor")) {
      return 250;
    }
    if (processor.equals("Intel i5 Core Processor")) {
      return 300;
    }
    if (processor.equals("Intel i7 Core Processor")) {
      return 500;
    }
    return 0;
  }

  // Your assignment will be to rewrite the laptop builder program we built in
  // Typescript
  // and expand it to contain additional features

  // The customer begins with an empty shopping cart
  // The customer can customize a laptop with the following
  // Screen e.g. 1080p, 4k, Touchscreen
  // RAM e.g. 8GB, 16 GB, 32GB
  // HDD e.g. 1TB HDD, 128GB SSD, 256GB SSD, 512 GB SSD
  // Processor e.g. i3, i5, i7
  // Each component will have varying price
  // The laptop itself also has a base price
  // The customer can add the built laptop to his shopping cart
  // The customer can add multiple products to his shopping cart
  // The customer can use a code that if correct, will apply a discount to the
  // total price in the shopping cart.

  public static void main(String args[]) {
    // boolean isUserTurn = true;
    int totalPrice = 0;
    // 1. Choose a Laptop
    String[] laptopOptions = { "Latitude", "Alienware", "Inspiron" };
    int laptopPrice = 0;
    Scanner userInput = new Scanner(System.in);
    System.out.println("Dear Customer, Welcome to Dell.");
    System.out.println("You may start choosing your Laptop Customization.");
    System.out.println("Choose your Display Option:");

    for (int i = 0; i < laptopOptions.length; i++) {
      System.out.println(i + "." + laptopOptions[i]);
    }

    Integer laptopIndex = Integer.parseInt(userInput.nextLine());

    System.out.println("You have chosen :" + laptopOptions[laptopIndex]);
    laptopPrice = executeLaptop(laptopOptions[laptopIndex]);

    System.out.println("Current Price is:" + laptopPrice);
    System.out.println(" ");

    // 2. Choose a screen
    int screenPrice = 0;
    // int combineSum1 = 0;
    int z;
    String[] laptopScreen = { "1080p", "4k", "Touchscreen" };
    System.out.println("Choose your screen:");
    Scanner userInput1 = new Scanner(System.in);

    for (int i = 0; i < laptopScreen.length; i++) {
      System.out.println(i + "." + laptopScreen[i]);
    }

    Integer screenIndex = Integer.parseInt(userInput1.nextLine());

    System.out.println("You have chosen :" + laptopScreen[screenIndex]);
    screenPrice = executeScreen(laptopScreen[screenIndex]);

    z = laptopPrice + screenPrice;

    System.out.println("Screen Price is:" + screenPrice);
    System.out.println("Current Price is:" + z);
    System.out.println(" ");
    // RAM e.g. 8GB, 16GB, 32GB
    // 2. Choose a Ram
    int ramPrice = 0;
    int y;
    // int combineSum1 = 0;
    String[] laptopRam = { "8GB", "16GB", "32GB" };
    System.out.println("Choose your RAM:");
    Scanner userInput2 = new Scanner(System.in);

    for (int i = 0; i < laptopRam.length; i++) {
      System.out.println(i + "." + laptopRam[i]);
    }

    Integer ramIndex = Integer.parseInt(userInput2.nextLine());

    System.out.println("You have chosen :" + laptopRam[ramIndex]);
    ramPrice = executeMemory(laptopRam[ramIndex]);

    // z = laptopPrice + screenPrice;
    y = laptopPrice + screenPrice + ramPrice;

    System.out.println("RAM Price is:" + ramPrice);
    System.out.println("Current Price is:" + y);
    System.out.println(" ");

    // 3. Choose a HDD
    // HDD e.g. 1TB HDD, 128GB SSD, 256GB SSD, 512 GB SSD
    int hddPrice = 0;
    int x;
    // int combineSum1 = 0;
    String[] laptopHDD = { "1TB HDD", "128GB HDD", "256GB HDD", "512GB HDD" };
    System.out.println("Choose your HDD:");
    Scanner userInput3 = new Scanner(System.in);

    for (int i = 0; i < laptopHDD.length; i++) {
      System.out.println(i + "." + laptopHDD[i]);
    }

    Integer hddIndex = Integer.parseInt(userInput3.nextLine());

    System.out.println("You have chosen :" + laptopHDD[hddIndex]);
    hddPrice = executeHDD(laptopHDD[hddIndex]);

    // z = laptopPrice + screenPrice;
    x = laptopPrice + screenPrice + ramPrice + hddPrice;

    System.out.println("HDD Price is:" + hddPrice);
    System.out.println("Current Price is:" + x);
    System.out.println(" ");

    // 4. Choose a Processor
    // Processor e.g. i3, i5, i7
    int processorPrice = 0;
    int w;
    // int combineSum1 = 0;
    String[] laptopProcessor = { "Intel i3 Core Processor", "Intel i5 Core Processor", "Intel i7 Core Processor" };
    System.out.println("Choose your HDD:");
    Scanner userInput4 = new Scanner(System.in);

    for (int i = 0; i < laptopProcessor.length; i++) {
      System.out.println(i + "." + laptopProcessor[i]);
    }

    Integer processorIndex = Integer.parseInt(userInput4.nextLine());

    System.out.println("You have chosen :" + laptopProcessor[hddIndex]);
    processorPrice = executeProcessor(laptopProcessor[processorIndex]);

    // z = laptopPrice + screenPrice;
    w = laptopPrice + screenPrice + ramPrice + hddPrice + processorPrice;

    System.out.println("Processor Price is:" + processorPrice);
    System.out.println("Total Price for your laptop is:" + w);
    System.out.println("Happy Shopping");
    System.out.println(" ");
  }

}