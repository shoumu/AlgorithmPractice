package me.laip.algorithms.poj;

import java.util.*;

/**
 * Created by Arthur on 2015/10/23.
 */
public class POJ1009 {

    static int[][] input;
    static int width, num, len, inputNum, numCount;
    static List<PosItem> posItemList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            width = scanner.nextInt();
            if (width == 0) {
                break;
            }

            // input part
            input = new int[2000][2];
            numCount = 0;
            for (inputNum = 0; ; inputNum ++) {
                num = scanner.nextInt();
                len = scanner.nextInt();
                if (num == 0 && len == 0) {
                    break;
                }
                input[inputNum][0] = num;
                input[inputNum][1] = len;
                numCount += len;
            }

            // cal
            // need to encode the final one
            int curPos = 1;
            posItemList = new ArrayList<PosItem>();
            for (int k = 0; k <= inputNum; k ++) {

                int row = (curPos - 1) / width;
                int col = (curPos - 1) % width;


                for (int i = row - 1; i <= row + 1; i ++) {
                    for (int j = col - 1; j <= col + 1; j ++) {
                        int surPos = i * width + j;
                        if (i < 0 || j < 0 || j >= width || surPos >= numCount ) {
                            continue;
                        }

                        PosItem posItem = new PosItem();
                        posItem.pos = surPos + 1;
                        posItem.edge = getEdge(surPos + 1);
                        posItemList.add(posItem);

                    }
                }
                if (k < inputNum) {
                    curPos += input[k][1];
                }
            }

            Collections.sort(posItemList, new Comparator<PosItem>() {
                @Override
                public int compare(PosItem o1, PosItem o2) {
                    return o1.pos - o2.pos;
                }
            });

//            for (PosItem posItem : posItemList) {
//                System.out.println(posItem.pos + " " + posItem.edge);
//            }

            System.out.println(width);
            PosItem tmpItem = posItemList.get(0);
            for (int i = 0; i < posItemList.size(); i ++) {
                if (posItemList.get(i).edge == tmpItem.edge) {
                    continue;
                }
                System.out.println(tmpItem.edge + " " + (posItemList.get(i).pos - tmpItem.pos));
                tmpItem = posItemList.get(i);
            }
            System.out.println(tmpItem.edge + " " + (numCount - tmpItem.pos + 1));
            System.out.println("0 0");
        }
        System.out.println("0");
    }

    public static int getNum(int pos) {
        int tmp = 0;
        for (int i = 0; i < inputNum; i ++) {
            tmp += input[i][1];
            if (pos <= tmp) {
                return input[i][0];
            }
        }
        return tmp;
    }

    public static int getEdge(int pos) {
        int curNum = getNum(pos);
        int row = (pos - 1) / width;        // consider a table index from 0
        int col = (pos - 1) % width;
        int edge = 0;

        for (int i = row - 1; i <= row + 1; i ++) {
            for (int j = col - 1; j <= col + 1; j ++) {
                int surPos = i * width + j;
                if (i < 0 || j < 0 || j >= width || surPos >= numCount || surPos == pos - 1) {
                    continue;
                }

                int surNum = getNum(surPos + 1);
                if (Math.abs(curNum - surNum) > edge) {
                    edge = Math.abs(curNum - surNum);
                }
            }
        }
        return edge;

    }

    static class PosItem {
        int pos;
        int edge;
    }

}
