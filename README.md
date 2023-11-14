# TimeManager

class TimeManager:

public Properties:
  mTime: MutableStateFlow(Int)

public Methods:
  timerStart()
  timerStop()
  timerReset()

## Example
in ViewModel:
  val mTM = TimeManager()

in Composable:
  val mStartScreenViewModel: StartScreenViewModel = viewModel()
  val mTime by mStartScreenViewModel.mTM.mTime.collectAsState()

## Implementation

### settings.gradle.kts:

repositories {

        google()
        mavenCentral()
        maven { setUrl("https://www.jitpack.io") }  // <--
    }
    
### gradle.kts(:app)

implementation("com.github.DmitryEntwickler:TimeManager:1.8")  // <-- or latest Version
