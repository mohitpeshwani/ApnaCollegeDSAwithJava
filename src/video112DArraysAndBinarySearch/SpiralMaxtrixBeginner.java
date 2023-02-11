package video112DArraysAndBinarySearch;

public class SpiralMaxtrixBeginner {
    public static void main(String[] args) {
        int arra[][] ={{1,2,3},
                       {4,5,6},
                       {7,8,9},
                       {10,12,15}};
        int rowStart = 0;
        int rowEnd = 3;
        int colStart = 0;
        int colEnd = 2;
        while(rowStart <= rowEnd && colStart <= colEnd) {
            //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(arra[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(arra[row][colEnd] +" ");
            }
            colEnd--;


            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(arra[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(arra[row][colStart] + " ");
            }
            colStart++;


        }
    }}
