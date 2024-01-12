let nums = [-1,0,1,2,-1,-4]
console.log(threeSum(nums))
function threeSum(nums) {
    let set=[]
    for(let i = 0; i < nums.length; i++) {
        for(let j = i+1; j < nums.length; j++) {
            for(let k = j+1; k < nums.length; k++) {
                if(nums[i] + nums[j] + nums[k] === 0) {
                    let solution = [nums[i], nums[j], nums[k]]
                    solution.sort()
                    console.log(solution)
                    if(!set.includes(solution)) {
                        set.push(solution)
                    }
                    if(set.length > 2 && set[0] === set[2]) console.log('same')
                    //console.log(`nums[${i}]: ${nums[i]}, nums[${j}]: ${nums[j]}, nums[${k}]: ${nums[k]}`)
                }
            }
        }
    }
    return set
    // return solutions
}