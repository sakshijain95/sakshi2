package nine;

public enum House {
        oneBHK(10),twoBHK(18),threeBHK(32);
        int price;
        House(int p) {
            price = p;
        }
        public int getPrice() {
            return price;
        }

        public static void main(String args[]){
            System.out.println("All House prices:");
            for (House h : House.values())
            {
                System.out.println(h + " " + "price " + h.getPrice() + " lakhs.");
            }
        }
    }
