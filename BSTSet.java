package testbstset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TYD
 */
public class BSTSet {
    private TNode root;
    
    public BSTSet(){
        root = null ;
    }
    public BSTSet(int[] input){
        root=null;
        for(int i=0;i<input.length;i++){
            this.add(input[i]);
        }
    }
    public boolean isIn(int v){

        if(root==null){
            return false;
        }

        TNode temproot = root;
             while(true){
                   if(temproot.element==v){
                     return true;
                   }
                   if(temproot.element>v&&temproot.left!=null){
                    temproot=temproot.left;  
                    }
                    if(temproot.element<v&&temproot.right!=null){
                    temproot=temproot.right;  
                    }
                    
                    //i++;
                   if(temproot.element<v&&temproot.right==null){
                       break;
                   }
                   else if(temproot.element>v&&temproot.left==null){
                       break;
                   }
                    
               }
        return false;
    }

    public void add(int v){

         TNode temproot = root;
            if (root == null) {
            root = new TNode(v, null, null);
            return;

            }

            while(temproot !=null){
                
                  if(temproot.element==v){
                  
                    break;
                  }
                   if(temproot.left!=null){
                if(temproot.left.element==v){
                  
                    break;
                }
               
                } 
                 if(temproot.right!=null){
                    if(temproot.right.element==v){
                   
                    break;
                }   
                 }
                if(temproot.element<v){
                    if(temproot.right==null){
                       temproot.right= new TNode(v, null, null);
                       break;
                    }
                     temproot=temproot.right;
                }
                
                if(temproot.element>v){
                    
                    if(temproot.left==null){
                       temproot.left= new TNode(v, null, null);

                       break;
                    }
                    temproot=temproot.left;

                }

            }

    }
    private TNode findMin(TNode t){
        if(t==null){
            
        }
        while(t.left !=null){
            t=t.left;
        }
        return t;
    }
    private TNode removeMin(TNode t){
        if(t==null){
            
        }
        else if(t.left !=null){
            t.left = removeMin(t.left);
            return t;
        }
        else{
           return t.right;
        }
         return null;
    }
    private TNode remove(TNode t,int v){
         TNode temproot = null; 
         if ( t == null ){
         }
         else if (t.element>v){
            t.left = remove(t.left,v);
         }
         else if (t.element<v){
            t.right = remove(t.right,v);
         }
         else if(t.left !=null && t.right !=null){
            t.element=(findMin(t.right)).element;
            t.right =removeMin(t.right);
         }
         else{
             t=(t.left!=null)?t.left:t.right;
         }
         return t;
         

     }
    public boolean remove(int v){
        boolean x=this.isIn(v);  
        if(x==false)
           return false;
        if(root==null){return false;}        
        else{
        remove(root,v);
        }

        return true;
    }
    

    private BSTSet union(TNode t,TNode s,BSTSet x){
        
        if(t!=null){
        union(t.left,s,x);

        x.add(t.element);
        union(t.right,s,x);
        }
        if(s!=null){
        union(t,s.left,x);

        x.add(s.element);
        union(t,s.right,x);
        }

        return x;
    }
    public BSTSet union(BSTSet s){
        BSTSet x = new BSTSet();
        TNode t=this.root;
        TNode h=s.root;
        BSTSet k = new BSTSet();
        k=union(t,h, x);

      return k;   
    }
        private BSTSet intersection(TNode t,TNode s,BSTSet x){
           BSTSet j = new BSTSet(); 
           int i=0;
        if(t!=null){
             if(t.left!=null){
       j= intersection(t.left,s,x);
             }
        if(this.isIn(s.element)==true){

        i=s.element;
        x.add(i);
        }
         if(t.right!=null){
        j= intersection(t.right,s,x);
         }
        }
        if(s!=null){
            if(s.left!=null){
            j=intersection(t,s.left,x);
            }
        if(this.isIn(s.element)==true){
        i=s.element;
        x.add(i);
        }
         if(s.right!=null){
        j=intersection(t,s.right,x);
         }
        }

        return x;

        }
    public BSTSet intersection(BSTSet s){
        BSTSet x = new BSTSet();
        TNode t=this.root;
        TNode h=s.root;

        BSTSet k = new BSTSet();
        if(h==null|t==null){
           return x; 
        }
        k=intersection(t,h, x);
       return x; 
    }
    private int size(TNode t,int v,int size){
        TNode temproot = null;   
        int count=0;
        if(t!=null){
       count+=size(t.left, v,++size)+size(t.right, v,++size);
       return count;
        } 
        v+=1;
        return 1;
     }
    public int size(){
        int size=0;
        if(root==null){
        }
        else{
        size=size(root,0,0)-1;

        }
    return size;
    }

    public void printBSTSet(){
        if(root==null)
        System.out.println("The set is empty");
        else{
        System.out.print("The set elements are: ");
        printBSTSet(root);
        System.out.print("\n");
        }
    }
    private void printBSTSet(TNode t){
        
        if(t!=null){
        printBSTSet(t.left);

        System.out.print(" " + t.element + ", ");
        printBSTSet(t.right);
        }

    }
   
    public class TNode {
    int element;
    TNode left;
    TNode right;
    
    TNode(int i, TNode l, TNode r){
        element = i;
        left = l;
        right = r;
        }

    }

}


