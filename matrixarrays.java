void main() {
    // ЗАДАЧА 1

    int[][] TwoD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    for (int i = 0; i < TwoD.length; i++) {
        for (int j = 0; j < TwoD[i].length; j++) {
            System.out.print(TwoD[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("");

    // ЗАДАЧА 2

    int[][] OneD = {
            {5, 10, 15},
            {20, 25, 30},
    };
    System.out.println(OneD[1][2]);
    OneD[0][1] = 99;
    for (int i = 0; i < OneD.length; i++) {
        for (int j = 0; j < OneD[i].length; j++) {
            System.out.print(OneD[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("");

    // ЗАДАЧА 3 / 4

    int[][] ThreeD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    int sum = 0, even = 0, odd = 0;
    for (int i = 0; i < ThreeD.length; i++) {
        for (int j = 0; j < ThreeD[i].length; j++) {
            sum += ThreeD[i][j];
            if (ThreeD[i][j] % 2 == 0) {
                even++;
            } else if (ThreeD[i][j] % 2 != 0) {
                odd++;
            }
        }
    }
    System.out.println("Sum: " + sum);
    System.out.println("Even: " + even);
    System.out.println("Odd: " + odd);
    System.out.println("");

    // ЗАДАЧА 5

    int[][] fourD = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
    };
    int min = fourD[0][0];
    int max = fourD[0][0];
    for (int i = 0; i < fourD.length; i++) {
        for (int j = 0; j < fourD[i].length; j++) {
            if (fourD[i][j] < min) {
                min = fourD[i][j];
            }
            if (fourD[i][j] > max) {
                max = fourD[i][j];
            }
        }
    }
    System.out.println("Min: " + min);
    System.out.println("Max: " + max);
    System.out.println("");

    // ЗАДАЧА 6

    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[2][3];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("");

    // ЗАДАЧА 7

    int[][] fifthD = {
            {1, 2, 3},
            {5, 6, 7},
            {8, 9, 10},
    };
    for (int i = 0; i < fifthD.length; i++) {
        int columnSum = 0;
        for (int j = 0; j < fifthD[i].length; j++) {
            columnSum += fifthD[j][i];
        }
        System.out.println("Column " + i + ": " + columnSum);
    }
    System.out.println("");

    // ЗАДАЧА 8

    System.out.print("Напишите число: ");
    int s = sc.nextInt();
    int quantity = 0;
    int[][] SixD = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    for (int i = 0; i < SixD.length; i++) {
        for (int j = 0; j < SixD[i].length; j++) {
            if (SixD[i][j] > s) {
                quantity++;
            }
        }
    }
    System.out.println("Quantity: " + quantity);
    System.out.println("");

    // ЗАДАЧА 9

    System.out.print("Напишите число: ");
    int d = sc.nextInt();
    int[][] SevenD = {
            {12, 23, 30},
            {43, 51, 63},
            {75, 84, 91}
    };
    System.out.println("This is your matrix");
    for (int i = 0; i < SevenD.length; i++) {
        for (int j = 0; j < SevenD[i].length; j++) {
            System.out.print(SevenD[i][j] + " ");
        }
        System.out.println();
    }

    boolean found = false;

    for (int i = 0; i < SevenD.length; i++) {
        for (int j = 0; j < SevenD[i].length; j++) {
            if(d == SevenD[i][j]) {
                System.out.println("Your number at: " + (i+1) + " row and " + (j+1) + " column");
                found = true;
                break;
            }
        }
    }
    if(!found) {
        System.out.println("Not Found");
    }
    System.out.println("");

    // ЗАДАЧА 10

    int[][] EightD = {
            {2, 2, 3},
            {4, 7, 6},
            {7, 8, 19}
    };
    int sum1 = 0;
    for (int i = 0; i < EightD.length; i++) {
        System.out.println("Diagonal values: " + EightD[i][i]);
    }
    for (int i = 0; i < EightD.length; i++) {
        sum1 += EightD[i][i];
    }
    System.out.println("Sum: " + sum1);
    System.out.println("");

    // ЗАДАЧА 11

    int[][] NineD = {
            {1, -2, 3},
            {-4, 5, 6},
            {-7, 8, -9}
    };
    System.out.println("Before:");
    for (int i = 0; i < NineD.length; i++) {
        for (int j = 0; j < NineD[i].length; j++) {
            System.out.print(NineD[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("After:");
    for (int i = 0; i < NineD.length; i++) {
        for (int j = 0; j < NineD[i].length; j++) {
            if (NineD[i][j] < 0) {
                NineD[i][j] = 0;
            }
            System.out.print(NineD[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("");

    // ЗАДАЧА 12

    int[][] TenD = {
            {10, 23, 24, 65},
            {41, 35, 56, 34},
            {17, 105, 69, 51}
    };
    for (int i = 0; i < TenD.length; i++) {
        int rowSum = 0;
        int Avgtotal = 2;
        for (int j = 0; j < TenD[i].length; j++) {
            rowSum += TenD[i][j];
            Avgtotal = rowSum / TenD[i].length;
        }
        System.out.println("Student " + (i+1) + " average: " + Avgtotal);
    }
    System.out.println("");
    int max100 = TenD[0][0];
    for (int i = 0; i < TenD.length; i++) {
        for (int j = 0; j < TenD[i].length; j++) {
            if (TenD[i][j] > max100) {
                max100 = TenD[i][j];
            }
        }
    }
    System.out.println("Class maximum: " + max100);
    System.out.println("");
    int sumAll = 0;
    int overallavg = 0;
    for (int i = 0; i < TenD.length; i++) {
        for (int j = 0; j < TenD[i].length; j++) {
            sumAll += TenD[i][j];
            overallavg = sumAll / (TenD[i].length*3);
        }
    }
    System.out.println("Overall Average: " + overallavg);
}