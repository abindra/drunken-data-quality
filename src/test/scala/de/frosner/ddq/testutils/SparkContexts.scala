package de.frosner.ddq.testutils

trait SparkContexts {

  import org.apache.spark.sql.SparkSession

  protected val spark = SparkSession
    .builder()
    .master("local[2]")
    .appName("Unit Tests Using Spark")
    .config("spark.sql.shuffle.partitions", "5")
    .config("spark.default.parallelism", "10")
    .getOrCreate()

  protected val sc = spark.sparkContext
  protected val sql = spark.sqlContext
}
