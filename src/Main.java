s seven\n");
            case (8) -> System.out.print("result second task:" + 8 + "  it's eight\n");
            case (9) -> System.out.print("result second task:" + 9 + "  it's nine\n");
        }

        for (int i = 0; i < sizeMas; i++) {
            if (minNum > mas_tas

        int[] mas_task5 = new int[sizeMas];
        System.out.print("\nfirst massive from 5 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task5[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task5[i] + "  ");
        }
        Arrays.sort(mas_task5);
        System.out.print("\nsecond massive from 5 task:");
        for (int i = 0; i < sizeMas; i++) {
            System.out.print(mas_task5[i] + "  ");
        }

        //6)..............................................

        double midNum = 0;
        int[] mas_task6 = new int[sizeMas];
        System.out.print("\nmassive from 6 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task6[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task6[i] + "  ");
            midNum += mas_task6[i];
        }
        midNum = midNum / sizeMas;
        System.out.print("\nanswer on task six:" + midNum);

        //7)..............................................

        int checkEvenNum, checkNum, sumEven = 0, sumOdd = 0;
        sizeMas = 12;
        int[] mas_task7 = new int[sizeMas];
        System.out.print("\nmassive from 7 task:");
        for (int i = 0; i < sizeMas; i++) {
            mas_task7[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(mas_task7[i] + "  ");
            checkEvenNum = mas_task7[i];
            checkNum = mas_task7[i];
            checkEvenNum = checkEvenNum % 2;
            if (checkEvenNum == 0) sumEven += checkNum;
            if (checkEvenNum > 0) sumOdd += checkNum;
        }
        System.out.print("\nanswer from 7 task: sum even: " + sumEven + " sum odd:  " + sumOdd);

        //8)..............................................

        int sizeX = 5, sizeY = 3;
        System.out.print("\nmassive from 8 task:\n");
        int[][] mas_task8 = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                mas_task8[i][j] = (int) (Math.random() * (100 - 1) + 1);
                System.out.print(mas_task8[i][j] + "   ");
            }
            System.out.print("\n");
        }

        //9)..............................................

        System.out.print("\nAnswer 9 task:\n");
        String s1, s2, s3, s4, s5, condition1, condition2 = null;
        System.out.print("s1:");
        s1 = in.nextLine();
        System.out.print("s2:");
        s2 = in.nextLine();
        System.out.print("s3:");
        s3 = in.nextLine();
        System.out.print("s4:");
        s4 = in.nextLine();
        System.out.print("s5:");
        s5 = in.nextLine();
        if (s4==s5) {
            condition1 = s1 + s3;
            System.out.print(condition2);
        } else {
            condition2 = s1 + s3;
            System.out.print(condition2);
        }
    }
}
