package org.example;

import java.util.Scanner;

public class menue {
    public static void main(String[] args) {
        int choix;
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix) {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    int[] tabExo1 = new int[]{31, 6, 177, 42, 93};
                    int max = tabExo1[0];
                    int valeurRechercher;
                    int position = -1;
                    //V1
                    System.out.println("AFFICHAGE DU TABLEAU :");
                    System.out.print("- ");
                    for (int i = 0; i < tabExo1.length; i++) {
                        System.out.print(tabExo1[i] + " - ");
                    }
                    System.out.println();
                    //V2
                    System.out.println("AFFICHAGE DU TABLEAU :");
                    System.out.print("-");
                    for (int nb : tabExo1) {
                        System.out.print(nb + " - ");
                    }
                    System.out.println();

                    for (int i = 1; i < tabExo1.length; i++) {
                        if (tabExo1[i] > max) {
                            max = tabExo1[i];
                        }
                    }
                    System.out.println("Le maximum est : " + max);

                    do {
                        System.out.print("Valeur rechercher : ");
                        valeurRechercher = scanner.nextInt();
                    } while (valeurRechercher < 0);

                    for (int i = 0; i < tabExo1.length; i++) {
                        if (tabExo1[i] == valeurRechercher) {
                            position = i;
                        }
                    }
                    if (position == -1) {
                        System.out.println("Valeur non trouver");
                    } else {
                        System.out.println("Valeur trouver en position : " + position);
                    }
                    break;
                case 2:
                    int[] tabExo2 = new int[]{3, 4, 17, 5, 8};
                    int[] tabP = new int[5];
                    int[] tabI = new int[5];
                    int sommepaire = 0;
                    int sommeimpaire = 0;

                    int indexP = 0;
                    int indexI = 0;

                    for (int i = 0; i < tabExo2.length; i++) {
                        if (tabExo2[i] % 2 == 0) {
                            tabP[indexP] = tabExo2[i];
                            sommepaire += tabP[indexP];
                            indexP++;
                        } else {
                            tabI[indexI] = tabExo2[i];
                            sommeimpaire += tabI[indexI];
                            indexI++;
                        }
                    }

                    System.out.println("Tableau des nombres pairs:");
                    for (int i = 0; i < indexP; i++) {
                        System.out.println(tabP[i] + " ");
                    }
                    System.out.println("Tableau des nombres impairs:");
                    for (int j = 0; j < indexI; j++) {
                        System.out.print(tabI[j] + " ");
                    }
                    System.out.println("\nSomme des nombres pairs: " + sommepaire);
                    System.out.println("\nSomme des nombres impairs: " + sommeimpaire);

                case 3:
                    //int[] tabExo3= new int[]{4,8,7,12};
                    //int[] tabjsp = new int[]{3,6};
                    //int[] tabjsa = new int[5];
                    //int sommetotal=0;
                    //for (int i=0;i<tabExo3.length;i++){
                    //    for (int j=0;j<tabjsp.length;j++) {
                    //      tabExo3[i] += tabjsp[j];
                    //   for (k = 0; k < tabjsa.length; k++) {
                    // }
                    //tabjsa[k] = tabExo3[i] * tabjsp[j];
                    //sommetotal += k++;
                    //}
                    // }

                    int[] tabExo3 = new int[]{4, 8, 7, 12};
                    int[] tabjsp = new int[]{3, 6};
                    int sommestotal = 0;

                    for (int i = 0; i < tabExo3.length; i++) {
                        for (int j = 0; j < tabjsp.length; j++) {
                            sommestotal += tabExo3[i] * tabjsp[j];
                        }
                    }
                    System.out.println("Tableau tabExo3:");
                    for (int j = 0; j < tabExo3.length; j++) {
                        System.out.print(tabExo3[j] + " ");
                    }
                    System.out.println("Tableau tabExo3:\n");
                    for (int j = 0; j < tabjsp.length; j++) {
                        System.out.print(tabjsp[j] + " ");
                    }
                    System.out.println("Le Schtroumpf est : \n" + sommestotal);
                    break;
                case 4:
                    int[][] tabExo4 = new int[4][4];
                    tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;
                    tabExo4[0][3] = 0;tabExo4[1][0] = 0;tabExo4[1][1] = 3;
                    tabExo4[1][2] = 0;tabExo4[1][3] = 6;tabExo4[2][0] = 0;
                    tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;
                    tabExo4[3][3] = 0;

                    // Uncomment pour l'Exemple n°2
                            /*
                            tabExo4[0][0] = 1;
                            tabExo4[0][1] = 2; tabExo4[0][2] = 0; tabExo4[0][3] = 0;
                            tabExo4[1][0] = 3; tabExo4[1][1] = 4; tabExo4[1][2] = 0; tabExo4[1][3] = 0;
                            tabExo4[2][0] = 5; tabExo4[2][1] = 6; tabExo4[2][2] = 0; tabExo4[2][3] = 0;
                            tabExo4[3][0] = 7; tabExo4[3][1] = 8; tabExo4[3][2] = 0; tabExo4[3][3] = 0;
                            */

                    System.out.print("Valeurs : ");
                    for (int i = 0; i < tabExo4.length; i++) {
                        for (int j = 0; j < tabExo4[i].length; j++) {
                            if (tabExo4[i][j] != 0) {
                                System.out.print(tabExo4[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();

                    System.out.print("Colonnes : ");
                    for (int i = 0; i < tabExo4.length; i++) {
                        for (int j = 0; j < tabExo4[i].length; j++) {
                            if (tabExo4[i][j] != 0) {
                                System.out.print(j + " ");
                            }
                        }
                    }
                    System.out.println();

                    System.out.print("Lignes : ");
                    for (int i = 0; i < tabExo4.length; i++) {
                        for (int j = 0; j < tabExo4[i].length; j++) {
                            if (tabExo4[i][j] != 0) {
                                System.out.print(i + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
            }
        } while (choix != 0);
    }
}