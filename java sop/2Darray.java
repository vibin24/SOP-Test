class TD{
    void set(int row, int col, int data){
        nums[row][col] = data;
    }
    
    void get(int row, int col, int data){
        System.out.print(nums[row][col]);
    }

}


class 2Darray{
    public Static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TD d= new TD();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums[][] = new int[n][m];

        for(int i = 0;i<n;i++){
            for(j = 0;j<m;j++){
                int v = sc.nextInt();
                nums[i][j] = v;
            }
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        int data = sc.nextInt;
        
        d.set(row,col,data);
        d.get(row,col,data);
    }
}