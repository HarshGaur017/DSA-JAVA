public class Patterns {
    
//Pattern Of Hollow Rectangle--------------------------------------------
    public static void hollow_rectangle(int totrows, int totcols){
        //outer loop
        for(int i=1; i<=totrows; i++){
            //inner loop
            for(int j=1; j<=totcols; j++){
                // cells - (i,j)
                if(i == 1 || i == totrows || j == 1 || j == totcols){ //boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//Pattern Of Inverted & Rotated Half-Pyramid---------------------------------
    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//Pattern Of Inverted Half-Pyramid withNO.---------------------------------
    public static void inverted_half_pyramid_withNo(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

//Floyd's Triangle---------------------------------
    public static void floyds_triangle(int n){
        int counter = 1; 
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }

//Zero One 0-1 Triangle---------------------------------
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if ((i+j)%2 ==0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

//Butterfly Pattern---------------------------------------
    public static void butterfly_pattern(int n){
        // 1st Half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//Solid Rhombus---------------------------------------
    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//Hollow Rhombus---------------------------------------
    public static void hollow_rhombus(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if (i ==1 || i == n || j == 1 || j == n ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//Diamond Pattern---------------------------------------
    public static void diamond_pattern(int n){
        // 1st Half
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
         for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//Number Pyramid---------------------------------------
    public static void numberPyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

//Palindromic Pattern with Numbers---------------------------------------
    public static void palindromic_pattern_wnumbers(int n){
        //outer loop
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // hollow_rectangle(6, 12);
        // inverted_rotated_half_pyramid(12);
        // inverted_half_pyramid_withNo(12);
        // floyds_triangle(6);
        // zero_one_triangle(3);
        // butterfly_pattern(3);
        // solid_rhombus(3);
        // hollow_rhombus(3);
        // diamond_pattern(7);
        // numberPyramid(3);
        palindromic_pattern_wnumbers(7);
    }
    
}