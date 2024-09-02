import java.util.*;
class Example{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);

		System.out.println("             _____                       _      _____         _     _ ");
		System.out.println("            / ____|                     | |    |  ___|       | |   (_)   ");
		System.out.println("           | (____  _ __ ___   __ _ _ __| |_   | |__ __ _ ___| |__  _  ___  _ __   ");
		System.out.println("            \\____ \\| \'_ \' _ \\ / _\' | \'__| __|  |  __/ _\' / __| \'_ \\| |/ _ \\| \'_ \\  ");
		System.out.println("            _____) | | | | | | (_| | |  | |_   | | | (_| \\__ \\ | | | | (_) | | | | ");
		System.out.println("           |______/|_| |_| |_|\\__,_|_|  \\___|  |_|  \\__,_|___/_| |_|_|\\___/|_| |_| ");

        	System.out.println("\n\n");


        	System.out.print("Enter date (YYYY-MM-DD): ");
        	String date = input.nextLine();

        	System.out.print("Enter customer name: ");
        	String customerName = input.nextLine();

        	System.out.println("\n\n______________________________________________________________________________________");

                System.out.println("\n\n");
		System.out.println("                              _____    ___ _    _     _       ");
		System.out.println("                             |_   _|__/ __| |_ (_)_ _| |_ ___ ");
		System.out.println("                               | ||___\\__ \\ \' \\| | \'_|  _(_-< ");
		System.out.println("                               |_|    |___/_||_|_|_|  \\__/__/ ");


        	System.out.print("Number of T-shirts: ");
       		int Tqty = input.nextInt();

        	System.out.print("unit price of T-shirt: ");
        	double tunitPrice = input.nextDouble();

        	System.out.print("discount rate (%): ");
        	double discountRate = input.nextDouble();

        	double discount = (tunitPrice * Tqty) * (discountRate / 100);
        	double ttotalAmount = (tunitPrice * Tqty) - discount;


                System.out.println("\n\n");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Description      |   QTY    |  Unit Price |   Amount   |");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| T-Shirt          |    "+Tqty+"     |     "+tunitPrice+"   |   "+ttotalAmount+"   |");
                System.out.println("+------------------+----------+-------------+------------+");

		System.out.println("\n\n______________________________________________________________________________________");

		System.out.println("\n\n");
		System.out.println("                              _____                                ");
		System.out.println("                             |_   _| _ ___ _  _ ___ ___ _ _ ___    ");
		System.out.println("                               | || \'_/ _ \\ || (_-</ -_) \'_(_-< ");
		System.out.println("                               |_||_| \\___/\\_,_/__/\\___|_| /__/ ");

        	System.out.print("Number of Trowsers: ");
       		int Trqty = input.nextInt();

        	System.out.print("unit price of Trowser: ");
        	double TrunitPrice = input.nextDouble();

        	System.out.print("discount rate (%): ");
        	double TrdiscountRate = input.nextDouble();

        	double Trdiscount = (TrunitPrice * Trqty) * (TrdiscountRate / 100);
        	double trtotalAmount = (TrunitPrice * Trqty) - Trdiscount;

                System.out.println("\n\n");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Description      |   QTY    |  Unit Price |   Amount   |");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Trowser          |    "+Trqty+"     |     "+TrunitPrice+"  |   "+trtotalAmount+"   |");
                System.out.println("+------------------+----------+-------------+------------+");

		System.out.println("\n\n______________________________________________________________________________________");

		System.out.println("\n\n");
		System.out.println("                              ____ _    _     _                            ");
		System.out.println("                             / ___| |_ (_)_ _| |_ ___                      ");
		System.out.println("                             \\__  \\ \' \\| | \'_|  _(_-<                      ");
		System.out.println("                             |____/_||_|_|_|  \\__/__/                      ");

        	System.out.print("Number of Shirts: ");
       		int Sqty = input.nextInt();

        	System.out.print("unit price of Shirt: ");
        	double SunitPrice = input.nextDouble();

        	System.out.print("discount rate (%): ");
        	double SdiscountRate = input.nextDouble();

        	double Sdiscount = (SunitPrice * Sqty) * (SdiscountRate / 100);
        	double StotalAmount = (SunitPrice * Sqty) - Sdiscount;

                System.out.println("\n\n");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Description      |   QTY    |  Unit Price |   Amount   |");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Shirt            |    "+Sqty+"     |     "+SunitPrice+"  |   "+StotalAmount+"   |");
                System.out.println("+------------------+----------+-------------+------------+");

		System.out.println("\n\n______________________________________________________________________________________");

		System.out.println("\n\n");
		System.out.println("                              ____ _            _                           ");
		System.out.println("                             /  __| |_  ___ _ _| |_ ___             ");
		System.out.println("                             \\__  \\ \' \\/ _ \\ \'_|  _(_-<              ");
		System.out.println("                             |____/_||_\\___/_|  \\__/__/             ");

        	System.out.print("Number of Shorts: ");
       		int Shqty = input.nextInt();

        	System.out.print("unit price of Short: ");
        	double ShunitPrice = input.nextDouble();

        	System.out.print("discount rate (%): ");
        	double ShdiscountRate = input.nextDouble();

        	double Shdiscount = (ShunitPrice * Shqty) * (ShdiscountRate / 100);
        	double ShtotalAmount = (ShunitPrice * Shqty) - Shdiscount;

                System.out.println("\n\n");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Description      |   QTY    |  Unit Price |   Amount   |");
                System.out.println("+------------------+----------+-------------+------------+");
                System.out.println("| Short            |    "+Shqty+"     |     "+ShunitPrice+"   |   "+ShtotalAmount+"   |");
                System.out.println("+------------------+----------+-------------+------------+");

        	double totalAmount = ttotalAmount + trtotalAmount + StotalAmount + ShtotalAmount;
		System.out.println("\n\n______________________________________________________________________________________");

		System.out.println("\n\n");
		System.out.println("+---------------------------------------------------------------------------------------------------+");
		System.out.println("|                                                                                                   |");
		System.out.println("|                     ___ _ _ _   ___                                                               |");
		System.out.println("|                    | _ |_) | | / __|_  _ _ __  _ __  __ _ _ _ _  _                                |");
		System.out.println("|                    | _ \\ | | | \\__ \\ || | \'  \\| \'  \\/ _\' | \'_| || |                               |");
		System.out.println("|                    |___/_|_|_| |___/\\_,_|_|_|_|_|_|_\\__,_|_|  \\_, |                               |");
		System.out.println("|                                                               |__/                                |");
		System.out.println("|                                                                                                   |");
		System.out.println("|                                                                                                   |");
		System.out.println("|       Customer : "+customerName+"                                                Date : "+date+"         |");
		System.out.println("|                                                                                                   |");
		System.out.println("+--------------------------------+--------------------+----------------------+----------------------+");
                System.out.println("| Description                    |        QTY         |       Unit Price     |        Amount        |");
		System.out.println("+--------------------------------+--------------------+----------------------+----------------------+");
		System.out.println("|                                |                    |                      |                      |");
		System.out.println("|  T-Shirt                       |      "+Tqty+"             |      "+tunitPrice+"           |      "+ttotalAmount+"          |");
		System.out.println("|                                |                    |                      |                      |");
		System.out.println("|  Trouser                       |      "+Trqty+"             |      "+TrunitPrice+"          |      "+trtotalAmount+"          |");
		System.out.println("|                                |                    |                      |                      |");
		System.out.println("|  Shirt                         |      "+Sqty+"             |      "+SunitPrice+"          |       "+StotalAmount+"         |");
		System.out.println("|                                |                    |                      |                      |");
		System.out.println("|  Short                         |      "+Shqty+"             |      "+ShunitPrice+"           |       "+ShunitPrice+"          |");
		System.out.println("|                                |                    |                      |                      |");
		System.out.println("+--------------------------------+--------------------+----------------------+----------------------+");
		System.out.println("|  Total                                                                     |        "+totalAmount+"        |");
		System.out.println("+----------------------------------------------------------------------------+----------------------+");








		




	}
}





