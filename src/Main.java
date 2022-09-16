public class Main {
    public static void main(String[] args) {
        Boss ZOmbee = new Boss();
        ZOmbee.setDamage(34);
        ZOmbee.setHelth(100);
        ZOmbee.setDefense("Mini Zombee");

        System.out.println(ZOmbee.getDamage());
        System.out.println(ZOmbee.getHelth());
        System.out.println(ZOmbee.getDefense());

    }
}