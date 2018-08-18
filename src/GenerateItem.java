/**
 * Program developed to act as a loot Table1 for the Guild Wars 2 Table1 Top RPG.
 *
 * @author Connor D. Milligan
 */

import java.util.HashMap;
import java.util.Random;

public class GenerateItem {
    public static void main(String[] args) {
        // Check usage for command line arguments
        try {
            if (args.length < 2 || Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > 3 ||
                Integer.parseInt(args[1]) < 1 || Integer.parseInt(args[1]) > 20) {
                usage();
            }
        } catch (NumberFormatException e) {
            usage();
        }

        Random random = new Random();

        // Build Loot Table One
        HashMap<String, String[]> lootTable1 = new HashMap<>(20);
        lootTable1.put("1", new String[]{"Gold", "Ten"});
        lootTable1.put("2", new String[]{"Gold", "Ten"});
        lootTable1.put("3", new String[]{"Consumable", "Common"});
        lootTable1.put("4", new String[]{"Consumable", "Common"});
        lootTable1.put("5", new String[]{"Consumable", "Common"});
        lootTable1.put("6", new String[]{"Armor", "Common"});
        lootTable1.put("7", new String[]{"Armor", "Common"});
        lootTable1.put("8", new String[]{"Weapon", "Common"});
        lootTable1.put("9", new String[]{"Weapon", "Common"});
        lootTable1.put("10", new String[]{"Armor", "Uncommon"});
        lootTable1.put("11", new String[]{"Armor", "Uncommon"});
        lootTable1.put("12", new String[]{"Weapon", "Uncommon"});
        lootTable1.put("13", new String[]{"Weapon", "Uncommon"});
        lootTable1.put("14", new String[]{"Armor", "Masterwork"});
        lootTable1.put("15", new String[]{"Armor", "Masterwork"});
        lootTable1.put("16", new String[]{"Weapon", "Masterwork"});
        lootTable1.put("17", new String[]{"Weapon", "Masterwork"});
        lootTable1.put("18", new String[]{"Weapon", "Rare"});
        lootTable1.put("19", new String[]{"Armor", "Rare"});
        lootTable1.put("20", new String[]{"Re-Roll", "Table One"});

        // Build Loot Table Two
        HashMap<String, String[]> lootTable2 = new HashMap<>(20);
        lootTable2.put("1", new String[]{"Weapon", "Rare"});
        lootTable2.put("2", new String[]{"Armor", "Rare"});
        lootTable2.put("3", new String[]{"Gold", "Fifty"});
        lootTable2.put("4", new String[]{"Gold", "Seventy-Five"});
        lootTable2.put("5", new String[]{"Gold", "One-Hundred"});
        lootTable2.put("6", new String[]{"Weapon", "Rare"});
        lootTable2.put("7", new String[]{"Armor", "Rare"});
        lootTable2.put("8", new String[]{"Player Choice", "Rare"});
        lootTable2.put("9", new String[]{"Weapon", "Exotic"});
        lootTable2.put("10", new String[]{"Weapon", "Exotic"});
        lootTable2.put("11", new String[]{"Armor", "Exotic"});
        lootTable2.put("12", new String[]{"Armor", "Exotic"});
        lootTable2.put("13", new String[]{"Gold", "One-Hundred-Fifty"});
        lootTable2.put("14", new String[]{"Armor Player Choice", "Exotic"});
        lootTable2.put("15", new String[]{"Weapon Player Choice", "Exotic"});
        lootTable2.put("16", new String[]{"Player Choice", "Exotic"});
        lootTable2.put("17", new String[]{"Gift of Mastery", "Legendary"});
        lootTable2.put("18", new String[]{"Gift of Fortune", "Legendary"});
        lootTable2.put("19", new String[]{"Gift of Weapon", "Legendary"});
        lootTable2.put("20", new String[]{"Re-Roll", "Table Two"});

        // Build Loot Table Three
        HashMap<String, String[]> lootTable3 = new HashMap<>(20);
        lootTable2.put("1", new String[]{"Gift of Mastery", "Legendary"});
        lootTable2.put("2", new String[]{"Gift of Fortune", "Legendary"});
        lootTable2.put("3", new String[]{"Gift of Weapon", "Legendary"});
        lootTable3.put("4", new String[]{"Weapon", "Legendary", "The Legend (Staff)"});
        lootTable3.put("5", new String[]{"Weapon", "Legendary", "Zap (Sword)"});
        lootTable3.put("6", new String[]{"Weapon", "Legendary", "The Lover (Shortbow)"});
        lootTable3.put("7", new String[]{"Weapon", "Legendary", "The Chosen (Shield)"});
        lootTable3.put("8", new String[]{"Weapon", "Legendary", "Tooth of Frostfang (Axe)"});
        lootTable3.put("9", new String[]{"Weapon", "Legendary", "Howl (Warhorn)"});
        lootTable3.put("10", new String[]{"Weapon", "Legendary", "Spark (Dagger)"});
        lootTable3.put("11", new String[]{"Weapon", "Legendary", "The Colossus (Hammer)"});
        lootTable3.put("12", new String[]{"Weapon", "Legendary", "Leaf of Kudzu (Longbow)"});
        lootTable3.put("13", new String[]{"Weapon", "Legendary", "Storm (Scepter)"});
        lootTable3.put("14", new String[]{"Weapon", "Legendary", "The Bard (Focus)"});
        lootTable3.put("15", new String[]{"Weapon", "Legendary", "The Energizer (Mace)"});
        lootTable3.put("16", new String[]{"Weapon", "Legendary", "The Hunter (Rifle)"});
        lootTable3.put("17", new String[]{"Weapon", "Legendary", "Chaos Gun (Pistol)"});
        lootTable3.put("18", new String[]{"Weapon", "Legendary", "Rodgort's Flame (Torch)"});
        lootTable3.put("19", new String[]{"Weapon", "Legendary", "Dawn/Dusk (Greatsword)"});
        lootTable3.put("20", new String[]{"Weapon Player Choice", "Legendary"});

        // Build Combined Loot Table
        HashMap<String, HashMap<String, String[]>> combinedLootTable = new HashMap<>(3);
        combinedLootTable.put("1", lootTable1);
        combinedLootTable.put("2", lootTable2);
        combinedLootTable.put("3", lootTable3);

        // Build armor and weapon selections
        String[] armors = {"Head", "Shoulders", "Chest", "Legs", "Feet"};
        String[] weapons = {"Axe", "Dagger", "Mace", "Pistol", "Sword", "Scepter", "Focus", "Shield", "Torch", "Warhorn",
                            "Greatsword", "Hammer", "Longbow", "Rifle", "Shortbow", "Staff"};

        // Build stat selections
        String[] stats = {"Endurance", "Toughness", "Precision", "Power", "Movement", "Observe", "Charisma", "Initiative"};
        HashMap<String, Integer> rarityTable = new HashMap<>(4);
        rarityTable.put("Common", 4);
        rarityTable.put("Uncommon", 6);
        rarityTable.put("Masterwork", 8);
        rarityTable.put("Rare", 8);
        rarityTable.put("Exotic", 12);

        // Pull the item from the correct table and initialize values
        String[] item = combinedLootTable.get(args[0]).get(args[1]);
        String itemName = item[0];
        String itemRarity = item[1];
        String itemType = "None";
        String statBonus1 = "None";
        String statBonus2 = "None";
        int statName1;
        int statName2;

        // Parse the item and assign stats
        if (itemName.equals("Armor")) {
            itemType = armors[random.nextInt(5)];
            if(itemRarity.equals("Rare") || itemRarity.equals("Exotic")) {
                // Block identical stat distributions
                do {
                    statName1 = random.nextInt(8);
                    statName2 = random.nextInt(8);
                } while (statName1 == statName2);

                statBonus1 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName1] + " Disposition";
                statBonus2 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName2] + " Disposition";
            } else {
                statName1 = random.nextInt(8);
                statBonus1 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName1] + " Disposition";
            }

        } else if (itemName.equals("Weapon")) {
            itemType = weapons[random.nextInt(16)];
            if(itemRarity.equals("Rare") || itemRarity.equals("Exotic")) {
                // Block identical stat distributions
                do {
                    statName1 = random.nextInt(8);
                    statName2 = random.nextInt(8);
                } while (statName1 == statName2);

                statBonus1 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName1] + " Disposition";
                statBonus2 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName2] + " Disposition";
            } else {
                statName1 = random.nextInt(8);
                statBonus1 = "+" + (random.nextInt(rarityTable.get(itemRarity)) + 1) + " " + stats[statName1] + " Disposition";
            }

        } else if(itemName.equals("Gold")) {
            itemType = "Gold";

        } else if(itemName.equals("Consumable")) {
            itemType = "Consumable";
        } else if(itemName.equals("Player Choice")) {
            itemType = "Player Choice";
        }

        displayItem(itemName, itemRarity, itemType, statBonus1, statBonus2);
    }

    public static void displayItem(String itemName, String itemRarity, String itemType, String statBonus1, String statBonus2) {
        System.out.println(itemName + ": " + itemRarity + " " + itemType);
        System.out.println("\t" + statBonus1);
        System.out.println("\t" + statBonus2);
    }

    public static void usage() {
        System.out.println("Usage: java GenerateItem");
        System.out.println("\t<table>: The loot table to roll from (integer[1-3]).");
        System.out.println("\t<roll>: The roll value to access the table (integer[1-20]).");
        System.exit(1);
    }
}
