# TimeManager

### Constructor
`val mTM = TimeManager()`

### Timer Block:

`mTime: MutableStateFlow(Int)`

`timerStart(delay: Long)` : starts increment mTime

`timerStop()`

`timerReset()`

### periodically Maker Block:

`mPeriodicallyMakerStatus: MutableStateFlow(EPeriodicallyMakerStatus)`

`mPeriodicallyMakerTick: MutableStateFlow(Long)`

`doPeriodically(delay: Long, everyTimes: Int, action: () -> Unit)` : starts count with delay milliseconds. Every count it increments mPeriodicallyMakerTick. Every count time set it calls action() and sets mPeriodicallyMakerStatus = TIME_TO_DO_SOMETHING

`stopDoPeriodically()`

## Example
**in ViewModel:**

`val mTM = TimeManager()`

**in Composable:**

```
val mStartScreenViewModel: StartScreenViewModel = viewModel()

val mTime by mStartScreenViewModel.mTM.mTime.collectAsState()
```

## Implementation

[![](https://www.jitpack.io/v/DmitryEntwickler/TimeManager.svg)](https://www.jitpack.io/#DmitryEntwickler/TimeManager)

### settings.gradle.kts:
```
repositories {

  google()
        
  mavenCentral()
        
  maven { setUrl("https://www.jitpack.io") }  // <--
        
}
```
    
### gradle.kts(:app)

`implementation("com.github.DmitryEntwickler:TimeManager:2.1")`  // <-- or latest Version
