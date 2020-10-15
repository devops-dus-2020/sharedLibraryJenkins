import org.*
def utils = new Utilities(this)
node {
  utils.mvn 'clean package'
}
