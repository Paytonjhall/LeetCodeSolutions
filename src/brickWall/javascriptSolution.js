/**
 * @param {number[][]} wall
 * @return {number}
 */
var leastBricks = function(wall) {
    wall  = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
    let map = new Map()
    // Max is really only used to keep track of the fewest cuts, so you don't have to iterate through your map at th end.
    let max = 0
    for (let row of wall) {
        let sum = 0
        // Sum will be how we keep track of the bricks, the number sum lands on tells us where we don't need to cut.
        for (let i = 0; i < row.length - 1; i++) {
            // Add the next value to sum
            sum += row[i]
            // Add sum to our map
            map.set(sum, (map.get(sum) || 0) + 1)
            // update max to keep track of which 'row' has the fewest cuts so far
            max = Math.max(max, map.get(sum))
        }
    }
    // Return the number of bricks minus the max number of cuts, this is the route with the fewest cuts, we are returning cut count.
    return wall.length - max

};