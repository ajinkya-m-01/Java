class ArrayDeclaration
{
    public static void main(String []args)
    {
        int []a;//a->1d
        int b[];//b->1d
        byte [   ]c;//c->1d
        short [][]d;//d->1d
        int []e,f,g;//e->1d,e->1d,e->1d
        int [][]h,i;//h->2d,i->2d
        int []j[],k;//j->2d,k->1d
        int []l[],m[][];//l->2d,m->3d
        //int []n,[]o,p;   ->Compile Time Error
        //int a[],b;//b->0
    }
}