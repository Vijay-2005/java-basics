public class PaintJob {
    public static int getBucketCount(double width, double height , double areaPerBucket ,int extraBuckets){
    if ( width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets<0  ){
        return -1 ;mu
    }
   double  areaOfWall = width*height;
    double areaOfWallRequireExtraBucket = areaOfWall-(areaPerBucket*extraBuckets);
    double BucketRequired = Math.ceil(areaOfWallRequireExtraBucket/areaPerBucket);



  return (int)BucketRequired;
    }
    public static int getBucketCount(double width, double height , double areaPerBucket ){
        if ( width <= 0 || height <= 0 || areaPerBucket <= 0  ){
            return -1 ;
        }
        double  areaOfWall = width*height;
        double areaOfWallRequireExtraBucket = areaOfWall;
        double BucketRequired = Math.ceil(areaOfWallRequireExtraBucket/areaPerBucket);
        return (int)BucketRequired; }
    public static int getBucketCount(double area , double areaPerBucket ){
        if (area <= 0 || areaPerBucket<=0){
            return -1 ;
        }
        double BucketRequired = Math.ceil(area/areaPerBucket);
        return (int)BucketRequired; }




}
