public  class Main {
    public static void main(String[] args) {
        ObjectPool obj = ObjectPool.getInstance();
        Resource r1 = obj.aquireResource();
        Resource r2 = obj.aquireResource();
        Resource r3 = obj.aquireResource();
        Resource r4 = obj.aquireResource();
        Resource r5 = obj.aquireResource();
        Resource r6 = obj.aquireResource();
        obj.releaseResource(r1);
    }
}