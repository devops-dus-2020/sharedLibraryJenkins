import org.foo.*
def utils = new Utilities(this)
node {
  utils.mvn 'clean package'
}
