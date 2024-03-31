import Foundation
import Shared

@MainActor
class ViewModel : ObservableObject {
    var useCase: GetAllUsersUseCase = DIHelper().createGetAllUsersUseCase
    
    @Published var users: [User] = []
    
    func observeDataFlow() {
        Task {
            do {
                users = try await useCase.invoke()
            }catch {
                debugPrint("Failed to get users with error \(error.localizedDescription)")
            }
        }
    }
}
